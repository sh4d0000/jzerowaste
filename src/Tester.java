import java.io.IOException;

import com.zerowaste.JZeroWaste;
import com.zerowaste.ModelManager;
import com.zerowaste.model.Role;
import com.zerowaste.model.User;

public class Tester {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		ModelManager<Role> roleManager = JZeroWaste.getRoleManager();

		try {
			Role role = new Role();
			role.setName("u1");

			System.out.println("list: " + roleManager.getAll());

			Role roleCreated = roleManager.save(role);
			System.out.println("Role created: " + roleCreated);
			System.out.println("list: " + roleManager.getAll());

			roleCreated.setName("u1updated");

			Role roleUpdated = roleManager.update(roleCreated);
			System.out.println("Role updated: " + roleUpdated);
			System.out.println("list: " + roleManager.getAll());

			Role roleDeleted = roleManager.delete(roleUpdated);
			System.out.println("Role deleted: " + roleDeleted);

			System.out.println("list: " + roleManager.getAll());

			// **************************************************
			
			ModelManager<User> userManager = JZeroWaste.getUserManager();

			User user = new User();
			user.setName("u1");
			user.setSurname("us1");
			user.setEmail("asdad");
			user.setPassword("asd");
			user.setNickname("asdad");

			System.out.println("list: " + userManager.getAll());

			User userCreated = userManager.save(user);
			System.out.println("User created: " + userCreated);
			System.out.println("list: " + userManager.getAll());

			userCreated.setName("u1Xupdated");

			User userUpdated = userManager.update(userCreated);
			System.out.println("User updated: " + userUpdated);
			System.out.println("list: " + userManager.getAll());

			User userDeleted = userManager.delete(userUpdated);
			System.out.println("User deleted: " + userDeleted);

			System.out.println("list: " + userManager.getAll());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
