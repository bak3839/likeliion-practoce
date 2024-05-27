package com.likelion.practice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skin")
@RequiredArgsConstructor
public class SkinController {
    /**
     * 문제3
     * "아리" 챔피언의 신규 스킨 추가하기
     * name: "불멸의 전설 아리"
     * grade: "전설"
     * price: 1820
     */

    /**
     * 문제4
     * grade가 "서사"인 모든 스킨 가격 1500으로 변경
     * 조건: 같은 트랜잭션 내에서 조회했을때 변경 내용이 잘 반영되어야 함
     */

    /**
     * 문제5
     * grade가 "전설"인 스킨을 가진 챔피언 조회하여 반환
     * responseDTO -> QusetionDTO 참고
     * return List<Question5DTO>
     */
}
