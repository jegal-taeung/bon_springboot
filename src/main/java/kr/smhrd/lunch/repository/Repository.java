package kr.smhrd.lunch.repository;

import kr.smhrd.lunch.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Goods, Integer> {
}
