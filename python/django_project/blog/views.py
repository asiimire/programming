from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
posts = [
    {
        'author': 'Asiimire',
        'title': 'Blog Post 1',
        'content': 'First post content',
        'date_posted': 'November 14, 2023'
    },
    {
        'author': 'Patricia',
        'title': 'Blog Post 2',
        'content': 'Second post content',
        'date_posted': 'November 15, 2023'
    }
]

def home(request):
    context = {
        'posts': posts
    }
    return render(request, 'blog/home.html', context)

def about(request):
    return render(request, 'blog/about.html')
