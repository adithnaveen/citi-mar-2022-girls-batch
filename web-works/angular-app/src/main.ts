import { enableProdMode, ApplicationRef } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';


import { enableDebugTools } from "@angular/platform-browser";

if (environment.production) {
  enableProdMode();
}

// on browser 
// ng.profiler.timeChangeDetection({record: true})

platformBrowserDynamic().bootstrapModule(AppModule)
  .then((module) => {
    const applicationRef = module.injector.get(ApplicationRef);
    const appComponent = applicationRef.components[0];
    enableDebugTools(appComponent);
  }).catch(err => console.error(err));