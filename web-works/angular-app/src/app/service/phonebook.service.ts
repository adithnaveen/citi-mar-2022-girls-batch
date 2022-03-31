import { Injectable } from '@angular/core';
import { Contact } from '../model/contact';
import { HttpClient } from '@angular/common/http';
import { Observable, ObservableLike } from 'rxjs';

// you need to install 
// npm install rxjs-compat 
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class PhonebookService {
  baseURL = 'http://localhost:4300/contacts/';
  // HttpClient -> comes from external resource
  constructor(private http: HttpClient) { }

  getContactDetails(id: number): Observable<Contact> {
    return this.http.get(this.baseURL + id).
      map(data => data as Contact);
  }

  addNewContact(contact: Contact): Observable<Contact> {
    return this.http.post(this.baseURL, contact)
      .map(data => data as Contact);
  }

  updateContact(contact: Contact): Observable<Contact> {
    return this.http.put(this.baseURL + contact.id, contact)
      .map(data => data as Contact);
  }

  // delete 
  // http://localhost:4300/contacts/101

  deleteContact(id: number): Observable<any> {
    return this.http.delete(this.baseURL + id);
  }

  // get all Contacts
  getAllContacts(): Observable<Contact[]> {
    return this.http.get(this.baseURL).map(resp => resp as Contact[]);
  }

  // get all Contacts
  getAllContactsPage(pageNumber: number = 1): Observable<Contact[]> {
    const params = {
      _page: '' + pageNumber
    };

    return this.http.get(this.baseURL, {params}).map(resp => resp as Contact[]);
  }
}




/*
version 1
 const contact = new Contact();

    contact.id = id;
    contact.firstname = 'Naveen';
    contact.lastname = 'Kumar';
    contact.gender = 'Male';
    contact.email = 'naveen@probits.in';
    contact.phone = '9900524255';
    contact.dob = '1990-10-20';
    contact.picture = '/assets/images/jobs.jpg';
    contact.city = 'Bengaluru';
    contact.state = 'Karnataka';
    contact.country = 'India';

    return contact;

    */