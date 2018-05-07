```
new Handler().postDelayed(new Runnable(){
  @Override
  public void run(){
      Intent intent = new Intent (FullscreenActivity.this,LoginActivity.class);			
      startActivity(intent);			
      FullscreenActivity.this.finish();
  }
}, 3000)
```

