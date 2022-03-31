import { Component, NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { platformBrowserDynamic } from "@angular/platform-browser-dynamic";


@Component({
    selector:"app-root", 
    template:`<h2>Welcome to angular in citi
        <p>This is my para</p> <second-app></second-app>`
})
 class HelloWorldComponent {}


 @Component({
     selector:"second-app", 
     template:"<hr> <p>My second component goes here"
 })
 class MySecondComponent {
     
 }

@NgModule({
    bootstrap:[HelloWorldComponent], 
    declarations:[
        // list of components which you have written 
        HelloWorldComponent, 
        MySecondComponent
    ], 
    imports:[BrowserModule]
})
export class AppModule {}

platformBrowserDynamic().bootstrapModule(AppModule);

