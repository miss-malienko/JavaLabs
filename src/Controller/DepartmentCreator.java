package Controller;

import Model.Department;
import Model.Group;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(int countOfGroups, int maxGroupsCount) {
        Department department = new Department();
        GroupCreator groupCreator = new GroupCreator();
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < countOfGroups; i++) {
            groups.add(groupCreator.createTypicalGroup());
        }
        department.setGroups(groups);
        return department;
    }

    public Department createTypicalDepartment() {
        Department department = createDepartment(4, 6);
        return department;
    }

}
