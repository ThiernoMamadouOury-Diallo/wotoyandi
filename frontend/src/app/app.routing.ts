import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthentificationComponent } from './components/authentification/authentification.component';
import {RegistrationComponent} from "./components/registration/registration.component";
import {FacebookComponent} from "./components/facebook/facebook.component";
import {NewPublicationComponent} from "./components/new-publication-travel/new-publication-travel.component";
import {HomePageComponent} from "./components/home-page/home-page.component";
import {ResetPasswordComponent} from "./components/reset-password/reset-password.component";
import {UserProfilComponent} from "./components/user-profil/user-profil.component";

const appRoutes: Routes = [
  { path: '', component: HomePageComponent},
  { path: 'account/login', component: AuthentificationComponent},
  { path: 'offer/new', component: NewPublicationComponent},
  { path: 'users/register', component: RegistrationComponent},
  { path: 'users/auth/facebook', component: FacebookComponent},
  { path: 'users/login/new', component: ResetPasswordComponent},
  { path: 'profils/1213', component: UserProfilComponent},
];


export const RoutingModule: ModuleWithProviders = RouterModule.forRoot( appRoutes, { useHash: true });
