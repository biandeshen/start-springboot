package top.biandeshen.springbootdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.biandeshen.springbootdemo.base.AbstractService;
import top.biandeshen.springbootdemo.entity.User;

@Service
@Transactional(readOnly = true)
public class UserService extends AbstractService<User>{
}
