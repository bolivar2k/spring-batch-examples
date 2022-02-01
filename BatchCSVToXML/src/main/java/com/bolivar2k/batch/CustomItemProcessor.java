package com.bolivar2k.batch;

import org.springframework.batch.item.ItemProcessor;  

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {  
   
   @Override 
   public Tutorial process(Tutorial item) throws Exception {  
      System.out.println("Processing..." + item); 
      return item; 
   } 
} 