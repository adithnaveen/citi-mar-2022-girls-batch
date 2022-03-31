import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { HomeComponent } from './components/home/home.component';
import { ContactDetailsComponent } from './components/contact-details/contact-details.component';
import { ContactListComponent } from './components/contact-list/contact-list.component';
import { FullnamePipe } from './pipes/fullname.pipe';
import { AgePipe } from './pipes/age.pipe';

import { HttpClientModule } from '@angular/common/http';

import { RouterModule, Router, Routes } from "@angular/router";
import { AddContactComponent } from './components/add-contact/add-contact.component';

const routes: Routes = [
  // http://localhost:4200
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home'
  }, {
    // http://localhost:4200/home
    path: 'home',
    component: HomeComponent
  },
  {
    // http://localhost:4200/contact-list
    path: 'contact-list',
    component: ContactListComponent
  },
  {
    // // http://localhost:4200/add-contact
    path: 'add-contact',
    component: AddContactComponent
  },
  {
    // // http://localhost:4200/contact-details/101
    path: 'contact-details/:id',
    component: ContactDetailsComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidebarComponent,
    HomeComponent,
    ContactDetailsComponent,
    ContactListComponent,
    FullnamePipe,
    AgePipe,
    AddContactComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
