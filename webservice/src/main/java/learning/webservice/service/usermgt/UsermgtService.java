package learning.webservice.service.usermgt;

import learning.webservice.annotation.ClassLog;
import learning.webservice.annotation.FunctionLog;
import learning.webservice.domain.usermgt.UserInfo;
import org.springframework.stereotype.Service;


@Service
@ClassLog
public class UsermgtService {

    @FunctionLog
    public UserInfo login(UserInfo userInfo){
        return userInfo;
    }
}
