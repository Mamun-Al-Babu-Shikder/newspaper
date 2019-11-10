package com.mcubes.newspaper.controller;

import com.mcubes.newspaper.model.SingleNews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by A.A.MAMUN on 11/10/2019.
 */
@Controller
public class HomeController {

    private List<SingleNews> newsList;
    private static String link, img, title;
    private static  int loop = 0;


    @GetMapping({"/","/home"})
    private String  getHomePage(Model model){

        newsList = new ArrayList<>();

        try {
            URL url = new URL("https://www.prothomalo.com/");
            InputStream is = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String line;
            loop = 0;
            while ((line=br.readLine())!=null){

                //loop++;
                line = line.trim();
                if(line.contains("link_overlay")){

                    line = line.replace("<a class=\"link_overlay\" href=\"","");
                    line = line.replace("\"></a>","");

                    line = "https://www.prothomalo.com"+line;
                    //System.out.println(line);
                    link = line;

                }else if(line.contains("<img src=\"//paloimages.prothom-alo.com")){

                    line = line.replace("<img src=\"","");
                    line = line.replace(line.substring(line.indexOf("\" alt")),"");
                    img = line;
                    //System.out.println("img : "+line);

                }else if(line.contains("<span class=\"title\">")) {
                    line = line.replace("<span class=\"title\">","");
                    line = line.replace("</span>","");
                    line = line.replace("<span class=\"subtitle\">","");
                   // System.out.println(line);
                    title = line;

                    newsList.add(new SingleNews(link, img, title));
                    loop++;
                }

                if(loop==10){
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }






        model.addAttribute("newsList", newsList);

        return "home";
    }


}
