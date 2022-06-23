package com.example.C32S.service;

import com.example.C32S.dto.RestarCantidadDTO;
import com.example.C32S.model.Producto;
import com.example.C32S.repository.IProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductoService {



    private IProductoRepository iProductoRepository;


    //Se inyecta la dependencia en el constructor
    public ProductoService(IProductoRepository iProductoRepository) {
        this.iProductoRepository = iProductoRepository;
    }


    public Producto crearProducto(Producto producto){
        //PERSISTE un Producto en la BD
        return iProductoRepository.save(producto);

    }


    public List<Producto> obtenerProductos(){
        //OBTIENE todos los productos desde la BD
        return iProductoRepository.findAll();
    }


    public List<Producto> enStock(){
        List<Producto> productosEnStock = new ArrayList<>();
        for (Producto producto : iProductoRepository.findAll()) {
            if (producto.getCantidad()>0){

                productosEnStock.add(producto);
            }

        }
        return productosEnStock;
    }

    public void elminarElProducto(Long id){
        iProductoRepository.deleteById(id);

    }


    public ResponseEntity<Producto> restarCantidadPorId (Long id, RestarCantidadDTO restarcantidad) {
        Optional<Producto> aActualizar = iProductoRepository.findById(id);
        Producto current = new Producto();
        if(aActualizar.isPresent()) {
            current = aActualizar.get();
            current.setCantidad(current.getCantidad()- restarcantidad.getCantidad());
            return ResponseEntity.ok(iProductoRepository.save(current));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
