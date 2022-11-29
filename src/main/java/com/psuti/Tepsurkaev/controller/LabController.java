package com.psuti.Tepsurkaev.controller;

import com.psuti.Tepsurkaev.dao.ProductRepository;
import com.psuti.Tepsurkaev.dao.ShopRepository;
import com.psuti.Tepsurkaev.dao.StorageRepository;
import com.psuti.Tepsurkaev.entity.Product;
import com.psuti.Tepsurkaev.entity.Storage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/lab")
@RestController
public class LabController {
    private final ShopRepository shopRepository;
    private final ProductRepository productRepository;
    private final StorageRepository storageRepository;

    public LabController(ShopRepository shopRepository, ProductRepository productRepository, StorageRepository storageRepository){
        this.shopRepository=shopRepository;
        this.productRepository=productRepository;
        this.storageRepository=storageRepository;
    }

    @GetMapping("/shops")
    public ResponseEntity getInfoProduct(@RequestParam("product") String productName){
        List<Product> products = productRepository.findAll();

        for(Product product:products){
            if(productName.equals(product.getProductName())){
                String response = productName + " находится в " + product.getShopName();
                return ResponseEntity.ok(response);
            }
        }

        List<Storage> storages = storageRepository.findAll();
        for(Storage storage : storages){
            if(productName.equals(storage.getProductName())){
                String response = productName + " находится на складе по адресу: " + storage.getAddress();
                return ResponseEntity.ok(response);
            }
        }

        return ResponseEntity.ok("Такого товара нет в наличии");
    }
}
