/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Constants.Authentication;
import TugasBesar.Kelompok4.Sosmed.Models.PostModel;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author sahanya
 */
public class PostController {

    PostModel model = new PostModel();

    public Stack get() {
        Stack<Stack> Data = model.GetPostAndUsers();
        if (Data.empty()) {
            Stack<String> Isi = new Stack<>(); //[], 
            Isi.push("");
            Isi.push("");
            Isi.push("Data ini kosong");
            Data.push(Isi);
        }

        return Data;

    }

    public void ForSend(String title, String description) {
        if (title.length() == 0) {
            JOptionPane.showMessageDialog(null, "title tidak boleh kosong");
        } else if (description.length() == 0) {
            JOptionPane.showMessageDialog(null, "Description tidak boleh kosong");
        } else if (title.length() == 0 && description.length() == 0) {
            JOptionPane.showMessageDialog(null, "Title dan Description tidak boleh kosong");
        } else {
            Authentication user = new Authentication();
            String sekarang = String.valueOf(java.time.LocalDate.now());
            String[] values = {title, description, user.getId(), sekarang};
            model.create(values);
            JOptionPane.showMessageDialog(null, "Postingan telah berhasil dibuat");
        }
    }
}
