package ATM.ATM;
//新增员工管理类

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement extends JFrame implements ActionListener {
    private JTextField employeeIdField;
    private JTextField employeeNameField;
    private JPasswordField employeePasswordField;
    private JButton addButton;
    private JButton removeButton;
    private JButton changePasswordButton;
    private JButton backButton;
    private Map<String, Employee> employees;

    public EmployeeManagement() {
        super("员工管理");
        employees = new HashMap<>();
        setLayout(new GridLayout(5, 2));

        add(new JLabel("员工ID："));
        employeeIdField = new JTextField();
        add(employeeIdField);

        add(new JLabel("员工姓名："));
        employeeNameField = new JTextField();
        add(employeeNameField);

        add(new JLabel("员工密码："));
        employeePasswordField = new JPasswordField();
        add(employeePasswordField);

        addButton = new JButton("添加员工");
        addButton.addActionListener(this);
        add(addButton);

        removeButton = new JButton("删除员工");
        removeButton.addActionListener(this);
        add(removeButton);

        changePasswordButton = new JButton("修改密码");
        changePasswordButton.addActionListener(this);
        add(changePasswordButton);

        backButton = new JButton("返回");
        backButton.addActionListener(this);
        add(backButton);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String id = employeeIdField.getText();
            String name = employeeNameField.getText();
            String password = new String(employeePasswordField.getPassword());
            if (!id.isEmpty() && !name.isEmpty() && !password.isEmpty()) {
                employees.put(id, new Employee(id, name, password));
                JOptionPane.showMessageDialog(this, "员工添加成功");
            } else {
                JOptionPane.showMessageDialog(this, "请填写完整信息");
            }
        } else if (e.getSource() == removeButton) {
            String id = employeeIdField.getText();
            if (employees.containsKey(id)) {
                employees.remove(id);
                JOptionPane.showMessageDialog(this, "员工删除成功");
            } else {
                JOptionPane.showMessageDialog(this, "员工不存在");
            }
        } else if (e.getSource() == changePasswordButton) {
            String id = employeeIdField.getText();
            String newPassword = new String(employeePasswordField.getPassword());
            if (employees.containsKey(id)) {
                try {
                    employees.get(id).changePassword(newPassword);
                    JOptionPane.showMessageDialog(this, "密码修改成功");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "员工不存在");
            }
        } else if (e.getSource() == backButton) {
            dispose();
            new Menu(new Account("888888", "123456", "50000"));
        }
    }

    public static void main(String[] args) {
        new EmployeeManagement();
    }
}

