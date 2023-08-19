package org.flipkart.repositories;

import org.flipkart.models.Member;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemberRepo {

    private static MemberRepo instance = new MemberRepo();

    Set<Integer> ids;
    Map<Integer, Member> memberMap;

    private MemberRepo(){
        this.ids = new HashSet<>();
        this.memberMap = new HashMap<>();
    }

    public static MemberRepo getInstance(){
        return instance;
    }

    public Set<Integer> getIds() {
        return ids;
    }

    public void setIds(Set<Integer> ids) {
        this.ids = ids;
    }

    public Map<Integer, Member> getMemberMap() {
        return memberMap;
    }

    public void setMemberMap(Map<Integer, Member> memberMap) {
        this.memberMap = memberMap;
    }
}
