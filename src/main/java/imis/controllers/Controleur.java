package imis.controllers;

import imis.services.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class Controleur {
    @Autowired
    Facade facade;

    @RequestMapping("")
    public String root(){
        return "hello";
    }

    @GetMapping("createEntreprise")
    public String createEntrepriseGet(){
        return "createEntreprise";
    }

    @PostMapping("createEntreprise")
    public String createEntreprisePost(@RequestParam String siret, @RequestParam String nom, @RequestParam String adresse) {
        return "hello";
    }

    @GetMapping("createFonction")
    public String createFonctionGet(){
        return "createFonction";
    }

    @PostMapping("createFonction")
    public String createFonctionPost(){
        // TODO ajouter les paramètres de la méthode
        // TODO créer la méthode dans la facade
        return "hello";
    }

    @GetMapping("createContact")
    public String createContactGet(Model model){
        // TODO aller chercher la liste des entreprises et des fonctions dans la facade
        // TODO les ajouter dans le modèle
        return "createContact";
    }

    @PostMapping("createContact")
    public String createContactPost(){
        // TODO ajouter les paramètres de la méthode
        // TODO créer la méthode dans la facade
        return "hello";
    }

    @GetMapping("plusContact")
    public String plusContact(Model model){
        // TODO devinez...
        return "plusContact";
    }

    @GetMapping("parMotCle")
    public String parMotCle(@RequestParam String motcle,Model model){
        // TODO devinez...
        return "entreprises";
    }
}
