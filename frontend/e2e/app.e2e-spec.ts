import { HelloSpringBootAngularUiPage } from './app.po';

describe('digicar-client App', () => {
  let page: HelloSpringBootAngularUiPage;

  beforeEach(() => {
    page = new HelloSpringBootAngularUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
