package br.com.zup.mercadoLivro.controller

import br.com.zup.mercadoLivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customers")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel("1", "Márcio", "marcio@email.com")
    }@PostMapping
    fun createCustomer(@RequestBody customer: CustomerModel) {
        println(customer)
    }
}