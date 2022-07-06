//package com.example.clinicadental.service;
//
//import com.example.clinicadental.model.Usuario;
//import com.example.clinicadental.model.UsuarioRol;
//import com.example.clinicadental.repository.UsuarioRepository;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//
//public class DataLoader implements ApplicationRunner {
//    private UsuarioRepository usuarioRepository;
//
//    public DataLoader(UsuarioRepository usuarioRepository) {
//        this.usuarioRepository = usuarioRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        //encriptar las contraseñas
//        BCryptPasswordEncoder passwordEncoder1=new BCryptPasswordEncoder();
//        String password1= passwordEncoder1.encode("password1");
//
//        BCryptPasswordEncoder passwordEncoder2=new BCryptPasswordEncoder();
//        String password2= passwordEncoder2.encode("password2");
//
//        //crear 2 instancias de usuarios
//
//        Usuario usuarioAdmin=new Usuario("Admin","admin","admin@digital.com",password1, UsuarioRol.ADMIN);
//        Usuario usuarioUser=new Usuario("User","user","user@digital.com",password2, UsuarioRol.USER);
//        this.usuarioRepository.save(usuarioAdmin);
//        this.usuarioRepository.save(usuarioUser);
//
//    }
//}
