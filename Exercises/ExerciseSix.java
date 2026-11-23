
import java.awt.event.*;
import javax.swing.*;

public class ExerciseSix {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 20, 100, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(130, 20, 200, 25);
        frame.add(txtName);

        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 100, 25);
        frame.add(lblNim);

        JTextField txtNim = new JTextField();
        txtNim.setBounds(130, 60, 200, 25);
        frame.add(txtNim);

        JLabel lblStudyProgram = new JLabel("Study Program:");
        lblStudyProgram.setBounds(20, 100, 100, 25);
        frame.add(lblStudyProgram);

        JTextField txtStudyProgram = new JTextField();
        txtStudyProgram.setBounds(130, 100, 200, 25);
        frame.add(txtStudyProgram);

        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(20, 140, 100, 25);
        frame.add(lblAddress);

        JTextField txtAddress = new JTextField();
        txtAddress.setBounds(130, 140, 200, 25);
        frame.add(txtAddress);

        JLabel lblOriginOfSchool = new JLabel("Origin of School:");
        lblOriginOfSchool.setBounds(20, 180, 110, 25);
        frame.add(lblOriginOfSchool);

        JTextField txtOriginOfSchool = new JTextField();
        txtOriginOfSchool.setBounds(130, 180, 200, 25);
        frame.add(txtOriginOfSchool);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(20, 230, 140, 30);
        frame.add(btnSave);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(190, 230, 140, 30);
        frame.add(btnReset);

        JTextArea areaResult = new JTextArea();
        areaResult.setBounds(20, 280, 330, 100);
        areaResult.setEditable(false);
        frame.add(areaResult);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = txtName.getText().trim();
                String nim = txtNim.getText().trim();
                String studyProgram = txtStudyProgram.getText().trim();
                String address = txtAddress.getText().trim();
                String originOfSchool = txtOriginOfSchool.getText().trim();

                if (name.isEmpty() || nim.isEmpty()
                        || studyProgram.isEmpty() || address.isEmpty()
                        || originOfSchool.isEmpty()) {

                    JOptionPane.showMessageDialog(frame,
                            "All fields must be filled in!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                areaResult.setText("Data Successfully Saved:\n");
                areaResult.append("Name: " + name + "\n");
                areaResult.append("NIM: " + nim + "\n");
                areaResult.append("Study Program: " + studyProgram + "\n");
                areaResult.append("Address: " + address + "\n");
                areaResult.append("Origin of School: " + originOfSchool + "\n");

                JOptionPane.showMessageDialog(frame,
                        "Data saved successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtName.setText("");
                txtNim.setText("");
                txtStudyProgram.setText("");
                txtAddress.setText("");
                txtOriginOfSchool.setText("");
                areaResult.setText("");
            }
        });

        frame.setVisible(true);
    }
}