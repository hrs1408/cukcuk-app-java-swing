package tokyo.huyhieu.cukcuk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.repository.UserRepository;
import tokyo.huyhieu.cukcuk.view.AdminFrame;
import tokyo.huyhieu.cukcuk.view.Login;
import tokyo.huyhieu.cukcuk.view.StaffFrame;

public class LoginController {
    private Login view;
    private UserRepository userRepo = new UserRepository();
    private List<User> user = new ArrayList<>();

    public LoginController(Login view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        handleLogin();
    }

    public void handleLogin() {
        this.view.getBtnLogin().addActionListener((e) -> {
            String username = this.view.getTxtUsername().getText();
            String password = String.valueOf(this.view.getTxtPassword().getPassword());
            user = userRepo.findAll();
            user.forEach(u -> {
                if (u.getUserName().equals(username) && u.getPassword().equals(password)) {
                    if (u.getRole()) {
                        new AdminController(new AdminFrame());
                        this.view.dispose();
                    } else if (!u.getRole()) {
                        new StaffController(new StaffFrame());
                        this.view.dispose();
                    }
                } 
            });
        });
    }

}
