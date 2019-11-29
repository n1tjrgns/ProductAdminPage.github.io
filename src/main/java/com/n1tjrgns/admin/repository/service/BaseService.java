package com.n1tjrgns.admin.repository.service;

import com.n1tjrgns.admin.ifs.CrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//각 서비스마다 Repository를 의존성 주입받고 있다.
//그 부분을 추상화하기위해 제네릭타입으로 entity 추가한다.

@Component
public abstract class BaseService<Req,Res,Entity> implements CrudInterface<Req,Res> {

    //제네릭으로 Entity와 Long형을 가지는 repository를 찾아오겠다.
    @Autowired(required = false) // 있을 수도 있고 없을 수도 있다.
    protected JpaRepository<Entity, Long> baseRepository;

}
