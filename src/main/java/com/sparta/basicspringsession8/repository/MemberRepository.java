package com.sparta.basicspringsession8.repository;

import com.sparta.basicspringsession8.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
