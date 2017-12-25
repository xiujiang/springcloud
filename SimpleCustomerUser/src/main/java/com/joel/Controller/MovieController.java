package com.joel.Controller;

import com.joel.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by joel on 2017/12/17.
 */
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    private User user;
    @GetMapping("/user/{Id}")
    public User findById(@PathVariable Long Id){
        System.out.println("Id:"+Id);
        return this.restTemplate.getForObject("http://localhost:8080/simpleProviderUser/User/"+Id,User.class);
    }

    @GetMapping("/user-info")
    public List<ServiceInstance> findServiceInstance(){
        return discoveryClient.getInstances("simpleProviderUser");
    }

}
