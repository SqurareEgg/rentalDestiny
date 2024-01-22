package com.square.rentalDestiny.entity;

import com.square.rentalDestiny.dto.MemberDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//id, 회원이름, 거주지역(도시), 거주지역(읍면동), 거주지역 우편번호
@Entity
@Getter
@Setter
@Table(name = "MEMBER")
public class MemberEntity {
    @Id
    @Column(name = "member_id")
    private String memberId;

    @Column
    private String memberPw;

    @Column
    private String memberName;

    @Column
    private String memberAddr;

    @Column
    private String memberDetailAddr;

    @Column
    private String memberEmail;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberId(memberDTO.getMemberId());
        memberEntity.setMemberPw(memberDTO.getMemberPw());
        memberEntity.setMemberName(memberDTO.getMemberName());
        memberEntity.setMemberAddr(memberDTO.getMemberAddr());
        memberEntity.setMemberDetailAddr(memberDTO.getMemberDetailAddr());
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());

        return memberEntity;
    }
}
