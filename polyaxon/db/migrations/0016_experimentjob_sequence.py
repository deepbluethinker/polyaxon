# Generated by Django 2.1.3 on 2018-12-10 23:37

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('db', '0015_auto_20181126_1241'),
    ]

    operations = [
        migrations.AddField(
            model_name='experimentjob',
            name='sequence',
            field=models.IntegerField(blank=True, default=0, null=True),
        ),
    ]