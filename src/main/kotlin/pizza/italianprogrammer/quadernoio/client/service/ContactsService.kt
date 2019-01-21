package pizza.italianprogrammer.quadernoio.client.service

import pizza.italianprogrammer.quadernoio.client.model.Contact
import pizza.italianprogrammer.quadernoio.client.model.PaymentGateway

interface ContactsService {

    fun getContacts(): List<Contact>
    fun getContact(contactId: String): Contact
    fun getContactByPaymentGateway(paymentGateway: PaymentGateway, gatewayCustomerId: String): Contact
    fun createContact(contact: Contact): Contact
    fun updateContact(contact: Contact): Contact
    fun deleteContact(contactId: String)
}