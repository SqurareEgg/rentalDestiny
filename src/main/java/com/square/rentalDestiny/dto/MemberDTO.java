package com.square.rentalDestiny.dto;

import com.square.rentalDestiny.entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberAddr;
    private String memberDetailAddr;
    private String memberEmail;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId(memberEntity.getMemberId());
        memberDTO.setMemberPw(memberEntity.getMemberPw());
        memberDTO.setMemberName(memberEntity.getMemberName());
        memberDTO.setMemberAddr(memberEntity.getMemberAddr());
        memberDTO.setMemberDetailAddr(memberEntity.getMemberDetailAddr());

        return memberDTO;
    }
}
