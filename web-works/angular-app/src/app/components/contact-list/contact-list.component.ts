import { Component, OnInit } from '@angular/core';
import { Contact } from 'src/app/model/contact';
import { PhonebookService } from 'src/app/service/phonebook.service';

@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css']
})
export class ContactListComponent implements OnInit {

  contacts: Contact[];
  pageNum = 1;
  constructor(private service: PhonebookService) { }

  // promise 
  ngOnInit() {
    this.service.getAllContactsPage(1)
      .subscribe(data => this.contacts = data);
  }

  loadMoreData() {
    this.pageNum++;
    this.service.getAllContactsPage(this.pageNum)
      .subscribe(data => this.contacts = [...this.contacts, ...data]);
  }

}
