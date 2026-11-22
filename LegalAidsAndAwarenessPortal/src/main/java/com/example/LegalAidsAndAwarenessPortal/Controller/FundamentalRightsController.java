package com.example.LegalAidsAndAwarenessPortal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/fundamental-rights")
public class FundamentalRightsController {

    @GetMapping
    public String fundamentalRights(){
        return "Fundamental_Rights";
    }

    RightsToEquality rte = new RightsToEquality();
    @GetMapping("/rights-to-equality")
    public String rightsToEquality(Model model){
        model.addAttribute("articles", RightsToEquality.articles);
        return "Rights_To_Equality";
    }

    @GetMapping("/rights-to-freedom")
    public String rightsToFreedom(Model model){
        model.addAttribute("articles", RightsToFreedom.articles);
        return "Rights_To_Freedom";
    }

    @GetMapping("/rights-against-exploitation")
    public String rightsAgainstExploitation(Model model){
        model.addAttribute("articles", RightsAgainstExploitation.articles);
        return "Rights_Against_Exploitation";
    }

    @GetMapping("/rights-to-freedom-of-religion")
    public String rightsToFreedomOfreligion(Model model){
        model.addAttribute("articles", RightsToFreedomOfReligion.articles);
        return "Rights_To_Freedom_of_Religion";
    }

    @GetMapping("/cultural-and-educational-rights")
    public String culturalAndEducationalRights(Model model){
        model.addAttribute("articles", CulturalAndEducationalRights.articles);
        return "Cultural_and_Educational_Rights";
    }

    RightsToConstitutionalRemedies constitutionalRemedies = new RightsToConstitutionalRemedies();
    @GetMapping("/rights-to-constitutional-remedies")
    public String rightsToConstitutionalRemedies(Model model){
        model.addAttribute("articles", constitutionalRemedies.articles);
        return "Rights_to_Constitutional_Remedies";
    }
}

class RightsToFreedom{

    static List<Map<String, String>> articles = new ArrayList<>();

    static{
        articles.add(Map.of(
            "number", "Article 19",
            "desc", "Article 19 guarantees six freedoms in the nature of civil rights,\n" +
                        "                    which are available only to citizens of India.\n" +
                        "                    These include the freedom of speech and expression,\n" +
                        "                    freedom of assembly without arms, freedom of association,\n" +
                        "                    freedom of movement throughout the territory of our country,\n" +
                        "                    freedom to reside and settle in any part of the country of India\n" +
                        "                    and the freedom to practice any profession"
        ));

        articles.add(Map.of(
                "number", "Article 20",
                "desc", "Article 20 of the Constitution of India provides\n" +
                        "                    protection in respect of conviction for offences"
        ));

        articles.add(Map.of(
                "number", "Article 21",
                "desc", "Article 21 of the Constitution of India guarantees\n" +
                        "                    the fundamental right to protection of life and personal liberty"
        ));

        articles.add(Map.of(
                "number", "Article 22",
                "desc", "Article 22 of the Constitution of India provides\n" +
                        "                    protection against arrest and detention in certain cases\n" +
                        "                    under the fundamental right to freedom"
        ));
    }
}

class RightsToEquality{

    static List<Map<String, String>> articles = new ArrayList<>();

    RightsToEquality(){
        articles.add(Map.of(
                "number", "Article 14",
                "desc", "The State shall not deny to any person equality before the law or\n" +
                        "            the equal protection of the laws within the territory of India."
        ));

        articles.add(Map.of(
                "number", "Article 15",
                "desc", "Article 15 of the Constitution of India forbids\n" +
                        "            discrimination on grounds only of religion, race,\n" +
                        "            caste, sex, or place of birth or any of them"
        ));

        articles.add(Map.of(
                "number", "Article 16",
                "desc", "Article 16 guarantees equality of opportunity in matters of public\n" +
                        "            employment and prevents the State from discriminating against anyone in\n" +
                        "            matters of employment on the grounds only of religion, race, caste, sex\n" +
                        "            (including sexual orientation), descent, place of birth, place of residence or income."
        ));

        articles.add(Map.of(
                "number", "Article 17",
                "desc", "Article 17 abolishes the practice of untouchability in any form,\n" +
                        "            making it an offense punishable by law. The Protection of Civil Rights Act,\n" +
                        "            1955 was enacted by Parliament to further this objective."
        ));

        articles.add(Map.of(
                "number", "Article 18",
                "desc", "Article 18 prohibits the State from conferring any titles other\n" +
                        "            than military or academic distinctions, and the citizens of India cannot accept\n" +
                        "            titles from a foreign state."
        ));
    }
}

class RightsAgainstExploitation{
    static List<Map<String, String>> articles = new ArrayList<>();

    static {
        articles.add(Map.of(
                "number", "Article 23",
                "desc", " Bans human trafficking, begar (unpaid forced labor), " +
                        "and other forms of forced or bonded labor. Paying less than " +
                        "the minimum wage has been held by courts to amount to forced labor."
        ));
        articles.add(Map.of(
                "number", "Article 24",
                "desc", " Prohibits employing children under 14 years of age " +
                        "in factories, mines, or other hazardous jobs."
        ));
    }
}

class RightsToFreedomOfReligion{

    static List<Map<String, String>> articles = new ArrayList<>();

    static{
        articles.add(Map.of(
                "number", "Articel 25",
                "desc", "Grants all persons freedom of conscience " +
                        "and the right to freely profess, practice, and propagate religion"
        ));
        articles.add(Map.of(
                "number", "Article 26",
                "desc", " Allows religious denominations to establish " +
                        "and maintain religious and charitable institutions, " +
                        "manage their own religious affairs, and own and " +
                        "administer property in accordance with law."
        ));
        articles.add(Map.of(
                "number", "Article 27",
                "desc", "Prohibits compelling anyone to pay " +
                        "taxes specifically earmarked for promoting or " +
                        "maintaining a particular religion or religious denomination"
        ));
        articles.add(Map.of(
                "number", "Article 28",
                "desc", " Bars religious instruction in schools " +
                        "wholly funded by the state, and protects students " +
                        "from forced religious instruction or worship in " +
                        "state-recognized or state-aided institutions."
        ));
    }
}

class CulturalAndEducationalRights{
    static List<Map<String, String>> articles = new ArrayList<>();

    static{
        articles.add(Map.of(
                "number","Article 29",
                "desc",  "Grants any citizen group with a distinct " +
                        "language, script, or culture the right to conserve " +
                        "it, and prohibits discrimination based on religion, " +
                        "race, caste, or language in State-maintained or " +
                        "State-aided educational institutions."
        ));
        articles.add(Map.of(
                "number", "Article 30",
                "desc", " Empowers religious and linguistic minorities " +
                        "to set up and manage institutions of their choice and" +
                        " ensures non-discrimination by the State in allocating financial aid."
        ));
    }
}

class RightsToConstitutionalRemedies{

    List<Map<String, String>> articles = new ArrayList<>();

    RightsToConstitutionalRemedies(){
        articles.add(Map.of(
                "number", "Article 32",
                "desc", " Guarantees the right to move the Supreme Court for Fundamental Rights enforcement and empowers it to issue directions, orders, or writs."
        ));
        articles.add(Map.of(
                "number", "Article 33",
                "desc", " Allows Parliament to modify Fundamental Rights for armed forces, police, and intelligence agencies."
        ));
        articles.add(Map.of(
                "number", "Article 34",
                "desc", "Covers restrictions on rights while martial law is in force"
        ));
        articles.add(Map.of(
                "number", "Article 35",
                "desc", " Gives Parliament exclusive power to make laws giving effect to certain Fundamental Rights provisions and prescribing punishments for prohibited acts."
        ));
    }
}