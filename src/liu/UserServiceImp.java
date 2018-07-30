package liu;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImp implements UserService {

	@Override
	public void find() {
		System.out.println("查询！");

	}

	@Override
	public void delete() {
        System.out.println("删除！");
		
	}

	@Override
	public void insert() {
		System.out.println("添加！");

	}

	@Override
	public void update() {
		System.out.println("更新！");

	}

}
