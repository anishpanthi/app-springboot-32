package dev.app.spring.api.family;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * @author Anish Panthi
 */
@Service
@RequiredArgsConstructor
@Log4j2
public class MemberServiceImpl implements MemberService{

  private final MemberDao memberDao;

  @Override
  public Member getMemberById(int id) {
    return null;
  }

  @Override
  public Member addMember(Member member) {
    return null;
  }

  @Override
  public Member updateMember(Member member) {
    return null;
  }

  @Override
  public void deleteMember(int id) {

  }

  @Override
  public List<Member> findAll() {
    return null;
  }
}
