package com.square.rentalDestiny.service;

import com.square.rentalDestiny.dto.MemberDTO;
import com.square.rentalDestiny.entity.MemberEntity;
import com.square.rentalDestiny.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberDTO login(MemberDTO memberDTO){
        Optional<MemberEntity> findMemberId = memberRepository.findById(memberDTO.getMemberId());
        if(findMemberId.isPresent()){
            MemberEntity memberEntity = findMemberId.get();
            if(memberEntity.getMemberPw().equals(memberDTO.getMemberPw())){
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            }
            else{
                return null;
            }
        }else{
            return null;
        }
    }

    public void register(MemberDTO memberDTO){
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

}
