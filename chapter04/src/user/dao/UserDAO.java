package user.dao;


import java.util.List;
import java.util.Map;

import user.bean.UserDTO;

public interface UserDAO {
	public void write(UserDTO userDTO);
	public List<UserDTO> getUserList();
	public UserDTO getUser(String id);
	//public void modify(UserDTO userDTO);
	public int delete(String id);
	public void modify(Map<String, String> map);

}
