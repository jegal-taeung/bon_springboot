package kr.smhrd.lunch.repository;

import kr.smhrd.lunch.entity.GoodsDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<GoodsDetail, Integer> {
}
