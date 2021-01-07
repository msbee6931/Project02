package kh.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kh.spring.dao.InputDAO;

@Service
public class InputService {
   @Autowired
   private InputDAO dao;
   
   public int insert(PersonDTO dto) {
      return dao.insert(dto);
   }
}