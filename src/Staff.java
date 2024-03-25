import java.awt.*;
import java.awt.event.*;

public class Staff extends Frame implements ActionListener {
    Label emp, id, name, sex, age, salary;
    TextField Id, Name, Age, Salary;
    Button add, remove, clear;
    Checkbox male, female;
    CheckboxGroup chp;
    TextArea tea;

    Staff() {
        super("Window Application");
        setSize(600, 600);
        setLayout(null);

        // Set background color
        setBackground(Color.red);
       
    

        Label staff = new Label("Employee");
        staff.setBounds(190, 3, 80, 50);
        id = new Label("ID :");
        id.setBounds(20, 60, 90, 40);
        name = new Label("NAME :");
        name.setBounds(20, 90, 80, 40);
        sex = new Label("SEX :");
        sex.setBounds(20, 120, 80, 40);
        age = new Label("AGE :");
        age.setBounds(20, 150, 80, 40);
        salary = new Label("SALARY :");
        salary.setBounds(20, 180, 80, 40);
  
          
          
          

        add(staff);
        add(id);
        add(name);
        add(sex);
        add(age);
        add(salary);

        Id = new TextField();
        Name = new TextField();
        Age = new TextField();
        Salary = new TextField();
        Id.setBounds(120, 60, 150, 25);
        Name.setBounds(120, 90, 150, 25);
        Age.setBounds(120, 150, 150, 25);
        Salary.setBounds(120, 180, 150, 25);
        add(Id);
        add(Name);
        add(Age);
        add(Salary);
        Id.addActionListener(this);
        Name.addActionListener(this);
        Age.addActionListener(this);
        Salary.addActionListener(this);

        add = new Button("ADD");
        remove = new Button("REMOVE");
        clear = new Button("CLEAR");

        add.setBounds(50, 230, 90, 40);
        remove.setBounds(150, 230, 90, 40);
        clear.setBounds(250, 230, 90, 40);
        add(add);
        add(remove);
        add(clear);
        add.addActionListener(this);
        remove.addActionListener(this);
        clear.addActionListener(this);
        chp = new CheckboxGroup();
        male = new Checkbox("Male", chp, true);
        female = new Checkbox("Female", chp, false);
        male.setBounds(120, 120, 80, 25);
        female.setBounds(200, 120, 80, 25);
        add(male);
        add(female);
        tea = new TextArea("", 9, 9, TextArea.SCROLLBARS_VERTICAL_ONLY);
        tea.setBounds(30, 280, 340, 200);
        add(tea);
        // ta.addTextListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Staff();
    }

    @Override
    public void actionPerformed(ActionEvent f) {
//        if (e.getSource() == add) {
//            tea.append(id.getText() + Id.getText() + "\n"
//                    + name.getText() + Name.getText() + "\n"
//                    + sex.getText() + chp.getSelectedCheckbox().getLabel() + "\n"
//                    + age.getText() + Age.getText() + "\n"
//                    + salary.getText() + Salary.getText());
//        } else if (e.getSource() == remove) {
//            tea.setText("");
//        } else {
//            Id.setText("");
//            Name.setText("");
//            Age.setText("");
//            Salary.setText("");
//        }
//    } 
if(f.getSource()==add){
    tea.append(id.getText()+Id.getText()+"\n"
    +name.getText() +Name.getText()+"\n"
    +sex.getText() +chp.getSelectedCheckbox().getLabel()+"\n"
    +age.getText() + Age.getText()+"\n"
    +salary.getText() + Salary.getText());
}else if(f.getSource()==remove){
    tea.setText("");
}else{
    Id.setText("");
    Name.setText("");
    Age.setText("");
    Salary.setText("");
}

}
}