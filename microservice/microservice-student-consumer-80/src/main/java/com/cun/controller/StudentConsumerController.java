package com.cun.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cun.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentConsumerController {
 
     @Resource
     private RestTemplate restTemplate;
      
     /**
      * 添加或者修改学生信息
      * @param student
      * @return
      */
     @PostMapping(value="/save")
     private boolean save(Student student){
         return restTemplate.postForObject("http://localhost:1001/student/save", student, Boolean.class);
     }
      
     /**
     * 查询学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value="/list")
    public List<Student> list(){
        return restTemplate.getForObject("http://localhost:1001/student/list", List.class);
    }
     
    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return restTemplate.getForObject("http://localhost:1001/student/get/"+id, Student.class);
    }
     
    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            restTemplate.getForObject("http://localhost:1001/student/delete/"+id, Boolean.class);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
