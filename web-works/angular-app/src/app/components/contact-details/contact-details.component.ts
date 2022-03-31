import { Component, OnInit } from '@angular/core';
import { Contact } from 'src/app/model/contact';
import { PhonebookService } from 'src/app/service/phonebook.service';
import { Serializer } from '@angular/compiler';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-contact-details',
  templateUrl: './contact-details.component.html',
  styleUrls: ['./contact-details.component.css']
})
export class ContactDetailsComponent implements OnInit {
  contact: Contact = new Contact();
  constructor(private service: PhonebookService, private activatedRouter: ActivatedRoute, private router: Router) { }

  // this will be taken from service
  ngOnInit() {

    // you dont have to create it, not a good practise
    // const service = new PhonebookService();

    this.activatedRouter.params.subscribe(paramsData => {
      this.service.getContactDetails(paramsData['id'])
        .subscribe(data => this.contact = data);

    })

  }

  deleteContact() {

    if (!confirm('Are you Sure to Delete?')) {
      return;
    }

    this.service.deleteContact(this.contact.id)
      .subscribe(() => {
        debugger 
        this.router.navigate(['/contact-list']);
      });
  }


}
