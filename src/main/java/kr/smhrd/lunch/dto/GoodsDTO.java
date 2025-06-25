package kr.smhrd.lunch.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.entity.GoodsDetail;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GoodsDTO {

    private Integer id;
    private String name;
    private String price;
    private Boolean isNew;
    private Boolean isBest;
    private String main_thumb;
    private GoodsDetail goodsDetail;

    public static GoodsDTO fromEntity(Goods entity) {
        return GoodsDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .isNew(entity.getIsNew())
                .isBest(entity.getIsBest())
                .main_thumb(entity.getMain_thumb())
                .build();


    }
}
