package tokyo.huyhieu.cukcuk.controller;

import tokyo.huyhieu.cukcuk.view.StaffFrame;

public class StaffController {
    private StaffFrame view;

    public StaffController(StaffFrame view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {

    }


}
