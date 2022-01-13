package org.springframework.samples.petclinic.food

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FoodController {

    @GetMapping("/food")
    fun index(model: Model): String {
        model["value"] = "LOREM IPSUM DOLOR SIT AMET"
        return "food/list"
    }

}


