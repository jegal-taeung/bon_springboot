package kr.smhrd.lunch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "goods_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDetail {

    // 연관 관계 설정이 가능하다!
    // @OneToOne, @JoinColumn("goods_id")
    // Goods -> Goods_detail

    @Id // GerneratedValue -> 이미 넣어놓은 데이터를 가지고 오는 작업
    private Integer goodsId;

    @Column(name = "sub_thumb", nullable = false)
    private String subThumb;

    @Column
    private String txt;

    @Column
    private String summary;


}