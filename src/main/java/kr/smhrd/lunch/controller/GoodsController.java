package kr.smhrd.lunch.controller;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://3.35.54.39:5173")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class GoodsController {

    private final Service service;
    @GetMapping("/goods_list")
    public List<GoodsDTO> goods_list() {
        System.out.println("goods list");

        // 2Step -> Service -> Repository
        return service.getList();

    }

    @GetMapping("/goods_list/{id}")
    public GoodsDTO goods_list(@PathVariable Integer id) {
        return service.getOne(id);
    }

}
