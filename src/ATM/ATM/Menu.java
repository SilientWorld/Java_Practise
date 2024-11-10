package ATM.ATM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private JPanel mp1, mp2;
    private JButton inqury;
    private JButton outmoney;
    private JButton inmoney;
    private JButton changepassword;
    private JButton employeeManagement;
    private JButton exit;
    private Account currentAccount;

    public Menu(Account account) {
        super("ATM自动取款机系统");
        currentAccount = account;
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inqury = new JButton("查询");
        outmoney = new JButton("取款");
        inmoney = new JButton("存款");
        changepassword = new JButton("更改密码");
        employeeManagement = new JButton("员工管理");
        exit = new JButton("退卡");

        inqury.setFont(new Font("黑体", Font.BOLD, 30));
        outmoney.setFont(new Font("黑体", Font.BOLD, 30));
        inmoney.setFont(new Font("黑体", Font.BOLD, 30));
        changepassword.setFont(new Font("黑体", Font.BOLD, 30));
        employeeManagement.setFont(new Font("黑体", Font.BOLD, 30));
        exit.setFont(new Font("黑体", Font.BOLD, 30));

        mp1 = new JPanel(new BorderLayout());
        JLabel jlb1 = new JLabel("ATM业务选择", JLabel.CENTER);
        jlb1.setFont(new Font("黑体", Font.BOLD, 60));
        jlb1.setForeground(Color.blue);
        mp1.add(jlb1, BorderLayout.CENTER);

        mp2 = new JPanel();
        mp2.add(inqury);
        mp2.add(inmoney);
        mp2.add(outmoney);
        mp2.add(changepassword);
        mp2.add(employeeManagement);
        mp2.add(exit);
        mp2.setLayout(new GridLayout(6, 1));

        add(mp1);
        add(mp2);
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        inqury.addActionListener(this);
        inmoney.addActionListener(this);
        outmoney.addActionListener(this);
        changepassword.addActionListener(this);
        employeeManagement.addActionListener(this);
        exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("查询")) {
            new Inqury(currentAccount);
        } else if (cmd.equals("取款")) {
            new OutMoney(currentAccount);
        } else if (cmd.equals("存款")) {
            new InMoney(currentAccount);
        } else if (cmd.equals("更改密码")) {
            new ChangePassword(currentAccount);
        } else if (cmd.equals("员工管理")) {
            new EmployeeManagement();
        } else if (cmd.equals("退卡")) {
            JOptionPane.showMessageDialog(null, "请记得取走您的银行卡");
            dispose();
            new Login(currentAccount);
        }
    }
}
