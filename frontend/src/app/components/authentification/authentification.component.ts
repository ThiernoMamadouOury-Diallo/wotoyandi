import {Component} from '@angular/core';
import { User } from './user.definition';
import {AuthentificationService} from './authentification.service';
@Component({
  selector: 'app-new',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent {
  public user: string;
  public error: Error= null;
  public id: string;
  public password: string;
  public response: string;

  constructor(private service: AuthentificationService) {
  }
  public updateUser( res: User): void {
    this.user = res.message;
    this.response = 'Authentification Reussie';
  }

  public updateError(error: Error): void {
    this.error = error;
  }

  auth(id, password) {
    this.id = id;
    this.password = password;

    this.service.me(id).subscribe( result => this.updateUser(result), err => this.updateError(err) );
  }

}
