package kr.smhrd.lunch.service;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.entity.GoodsDetail;
import kr.smhrd.lunch.repository.DetailRepository;
import kr.smhrd.lunch.repository.Repository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service {
    private final DetailRepository detailRepository;
    private final Repository repository;

    public List<GoodsDTO> getList() {
        List<Goods> list = repository.findAll();
        List<GoodsDTO> dtos = new ArrayList<>();
        for (Goods goods : list) {
            dtos.add(GoodsDTO.fromEntity(goods));
        }
        return dtos;
    }

    public GoodsDTO getOne(Integer id) {
        Goods goods = repository.findById(id).orElseThrow(IllegalArgumentException::new);
        GoodsDetail goodsDetail = detailRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        GoodsDTO goodsDTO = GoodsDTO.fromEntity(goods);
        goodsDTO.setGoodsDetail(goodsDetail);
        return goodsDTO;
    }
}
