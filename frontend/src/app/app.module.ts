import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { RoutingModule } from './app.routing';
import { AppComponent } from './app.component';
import { AuthentificationComponent } from './components/authentification/authentification.component';

import { AuthentificationService } from './components/authentification/authentification.service';
import { HttpModule } from '@angular/http';
import { NavTopComponent } from './components/nav-top/nav-top.component';
import { FooterComponent } from './components/footer/footer.component';
import {FormsModule} from "@angular/forms";
import { CartographieComponent } from './components/cartographie/cartographie.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { FacebookComponent } from './components/facebook/facebook.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { NewPublicationComponent } from './components/new-publication-travel/new-publication-travel.component';
import { ResetPasswordComponent } from './components/reset-password/reset-password.component';
import { UserProfilComponent } from './components/user-profil/user-profil.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthentificationComponent,
    NavTopComponent,
    FooterComponent,
      CartographieComponent,
      RegistrationComponent,
      FacebookComponent,
      HomePageComponent,
      NewPublicationComponent,
      ResetPasswordComponent,
      UserProfilComponent,
  ],
  imports: [
    BrowserModule,
    RoutingModule,
    HttpModule,
    FormsModule,
  ],
  providers: [
    AuthentificationService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
